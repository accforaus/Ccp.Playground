//
//  UserInformation.swift
//  Project2_signUp
//
//  Created by Juwon Lee on 8/8/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class UserInformation: NSObject {
    
    var id: String?
    var password: String?
    var phoneNumber: String?
    var birthday: String?
    
    static let shared: UserInformation = UserInformation()
    

}
