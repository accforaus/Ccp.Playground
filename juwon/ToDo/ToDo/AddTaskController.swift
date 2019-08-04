//
//  AddTaskController.swift
//  ToDo
//
//  Created by Juwon Lee on 8/3/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

protocol AddTask {
    func addTask(name: String)
}



class AddTaskController: UIViewController {

    @IBOutlet weak var taskNameOutlet: UITextField!
    
    @IBOutlet weak var addButtonOutlet: UIButton!
    
    @IBAction func addAction(_ sender: Any) {
        if taskNameOutlet.text != ""
        {
            delegate?.addTask(name: taskNameOutlet.text!)
            navigationController?.popViewController(animated: true)
        }
    }
    
    var delegate: AddTask?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        addButtonOutlet.layer.borderWidth = 0.3
        addButtonOutlet.layer.cornerRadius = 0.5 * addButtonOutlet.bounds.size.width
        addButtonOutlet.clipsToBounds = true
        taskNameOutlet.layer.borderWidth = 0

        // Do any additional setup after loading the view.
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
