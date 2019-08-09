//
//  LastViewController.swift
//  Project2_signUp
//
//  Created by Juwon Lee on 8/8/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class LastViewController: UIViewController, UITextFieldDelegate {

    // MARK: Properties
    @IBOutlet weak var phoneNumberField: UITextField!
    @IBOutlet weak var birthdayLabel: UILabel!
    @IBOutlet weak var datePicker: UIDatePicker!
    @IBOutlet weak var cancelButton: UIButton!
    @IBOutlet weak var signUpButton: UIButton!
    
    // MARK: Actions
    @IBAction func datePickerValueDidChange(_ sender: UIDatePicker) {

        let date: Date = self.datePicker.date
        let dateString: String = self.dateFormatter.string(from: date)

        self.birthdayLabel.text = dateString
        dateChanged = true
        
        updateSignUpButtonState()

    }
    
    @IBAction func goBack(_ sender: UIButton) {
        
        UserInformation.shared.birthday = phoneNumberField.text
        UserInformation.shared.phoneNumber = birthdayLabel.text
        self.navigationController?.popViewController(animated: true)

    }
    
    @IBAction func cancelButtonTouched(_ sender: UIButton) {
        
        UserInformation.shared.birthday = ""
        UserInformation.shared.phoneNumber = ""
        UserInformation.shared.id = ""
        UserInformation.shared.password = ""
        
        self.dismiss(animated: true, completion: nil)
       
    }
    
    @IBAction func signUpButtonTouched(_ sender: UIButton) {
        
        UserInformation.shared.birthday = birthdayLabel.text
        UserInformation.shared.phoneNumber = phoneNumberField.text
        
        self.dismiss(animated: true, completion: nil)
     
    }
    
    // MARK: Functions
    let dateFormatter: DateFormatter = {
        
        let formatter: DateFormatter = DateFormatter()
        formatter.dateStyle = .medium
        formatter.locale = Locale(identifier: "en_US")
        formatter.setLocalizedDateFormatFromTemplate("MMMMd, yyyy")
        
        return formatter
        
    }()
    
    var dateChanged: Bool = false
    
    func updateSignUpButtonState() {
        
        if let birthday: String = birthdayLabel.text,
            birthday.count > 0,
            dateChanged == true
             {
            
            signUpButton.isEnabled = true 
            
        } else {
            
            signUpButton.isEnabled = false
        }
    }
    
    func textField(_ textField: UITextField, shouldChangeCharactersIn range: NSRange, replacementString string: String) -> Bool {
        
        updateSignUpButtonState()
        
        return true
    }
    override func viewDidLoad() {
        
        super.viewDidLoad()
        datePicker?.datePickerMode = .date
        self.datePicker.addTarget(self, action: #selector(self.datePickerValueDidChange(_:)), for: UIControl.Event.valueChanged)
        birthdayLabel.text = dateFormatter.string(from: datePicker.date)
        
    }
}

