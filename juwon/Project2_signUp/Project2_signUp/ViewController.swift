//
//  ViewController.swift
//  Project2_signUp
//
//  Created by Juwon Lee on 8/7/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    // MARK: Properties
    @IBOutlet var idField: UITextField!
    @IBOutlet var passwordField: UITextField!
    
    // MARK: Functions
    override func viewDidLoad() {
        
        super.viewDidLoad()
        
    }
    
    override func viewWillAppear(_ animated: Bool) {
        
        super.viewWillAppear(animated)
        idField.text = UserInformation.shared.id
        
    }
    
}

