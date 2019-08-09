//
//  SecondViewController.swift
//  Project2_signUp
//
//  Created by Juwon Lee on 8/8/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class SecondViewController: UIViewController, UITextFieldDelegate, UIImagePickerControllerDelegate, UINavigationControllerDelegate {
    
    // MARK: Properties
    @IBOutlet weak var idField: UITextField!
    @IBOutlet weak var passwordField: UITextField!
    @IBOutlet weak var confirmField: UITextField!
    @IBOutlet weak var nextButton: UIButton!
    @IBOutlet weak var introductionField: UITextView!
    @IBOutlet weak var photoImageView: UIImageView!

    @IBAction func nextButtonTouched(_ sender: UIButton) {
        
        UserInformation.shared.id = idField.text
        UserInformation.shared.password = passwordField.text
        
    }

    // MARK: Actions
    @IBAction func cancelAndgoBackTo1() {
        
        UserInformation.shared.birthday = ""
        UserInformation.shared.phoneNumber = ""
        UserInformation.shared.id = ""
        UserInformation.shared.password = ""
        
        self.dismiss(animated: true, completion: nil)
        
    }
    
    @IBAction func selectImageFromPhotoLibrary(_ sender: UITapGestureRecognizer) {
        
        let imagePickerController = UIImagePickerController()
        imagePickerController.sourceType = .photoLibrary
        imagePickerController.allowsEditing = true
        imageChanged = true
        present(imagePickerController, animated: true, completion: nil)
        imagePickerController.delegate = self
        
    }
    
    // MARK: Functions 
    func updateNextButtonState() {
        
        if let id: String = idField.text,
            id.count > 0,
            let password: String = passwordField.text,
            password.count > 0,
            let confirm: String = confirmField.text,
            confirm.count > 0,
            let introduction: String = introductionField.text,
            introduction.count > 0,
            password == confirm,
            imageChanged == true
            
        {
            
            nextButton.isEnabled = true 
            
        } else {
            
            nextButton.isEnabled = false
        }
    }
    
    func textField(_ textField: UITextField, shouldChangeCharactersIn range: NSRange, replacementString string: String) -> Bool {
        
        updateNextButtonState()
        
        return true
    }
    
    func imagePickerController(_ picker: UIImagePickerController,
                               didFinishPickingMediaWithInfo info: [UIImagePickerController.InfoKey : Any]) {
        
        guard let selectedImage = info[.originalImage] as? UIImage else {
            
            fatalError("오류가 발생했습니다.")
            
        }
        
        photoImageView.image = selectedImage
        dismiss(animated: true, completion: nil)
        
    }
    
    var imageChanged: Bool = false
    
    func imagePickerControllerDidCancel(_ picker: UIImagePickerController) {
        
        dismiss(animated: true, completion: nil)
        
    }
    
    override func viewDidLoad() {
        
        super.viewDidLoad()
        
        idField.delegate = self
        passwordField.delegate = self
        confirmField.delegate = self
        
        updateNextButtonState()
        
    }
    
    override func viewWillAppear(_ animated: Bool) {
        
        super.viewWillAppear(animated)
        updateNextButtonState()
        
    }
    
}
