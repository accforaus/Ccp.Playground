//
//  additionalInfoViewController.swift
//  Project2_signUp
//
//  Created by Juwon Lee on 8/7/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class AdditionalInfoViewController: UIViewController {

    
    
    @IBOutlet weak var datePicker: UIDatePicker!
    @IBOutlet weak var bDayLabel: UILabel!
    @IBOutlet weak var telField: UITextField!
    @IBOutlet weak var signUpButton: UIButton!
    
    
    let dateFormatter: DateFormatter = {
        let formatter: DateFormatter = DateFormatter()
        formatter.dateFormat = "MM/dd/yyyy"
        return formatter
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.datePicker.addTarget(self, action: #selector(self.datePickerValueDidChange(_:)), for: UIControl.Event.valueChanged)

        // Do any additional setup after loading the view.
        
    }
    
    
    @IBAction func signUp(_ sender: UIButton) {
        
        
        self.dismiss(animated: true, completion: nil)
        
    
    }
    @IBAction func datePickerValueDidChange(_ sender: UIDatePicker) {
        let date: Date = self.datePicker.date
        let dateString: String = self.dateFormatter.string(from: date)
        
        self.bDayLabel.text = dateString
    }
    
    
    @IBAction func goRoot() {
        MyInfo.shared.id = ""
        MyInfo.shared.password = ""
        MyInfo.shared.tel = ""
        MyInfo.shared.bDay = ""

        self.dismiss(animated: true, completion: nil)
        //self.navigationController?.popToRootViewController(animated: true)
    }
    
    @IBAction func goBack() {
        MyInfo.shared.tel = telField.text
        MyInfo.shared.bDay = bDayLabel.text
        
        let ipvc = ImagePickerViewController()
        self.navigationController?.popToViewController(ipvc, animated: true)
      
    }
    
    func textField(_ textField: UITextField, shouldChangeCharactersIn range: NSRange, replacementString string: String) -> Bool {
        
        updateSignUpButtonState()
        
        
        return true
    }

    
    private func updateSignUpButtonState() {
        if let tel: String = telField.text,
            tel.count > 0,
            let bDay: String = bDayLabel.text,
            bDay.count > 0 {
            signUpButton.isEnabled = true
        } else {
            signUpButton.isEnabled = false
        }
    }
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
