//
//  ViewController.swift
//  ToDo
//
//  Created by Juwon Lee on 8/2/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITableViewDelegate, UITableViewDataSource, AddTask, ChangeButton {
    
 
    var tasks : [Task] = []
    let empty: UIImage = UIImage(imageLiteralResourceName: "checkBoxEmpty")
    let filled: UIImage = UIImage(imageLiteralResourceName: "checkBoxFilled")

    @IBOutlet weak var tableView: UITableView!
    
    
    override func viewDidLoad() {
        
        tasks.append(Task(name: "6일까지 희망과목등록"))
       
        
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return tasks.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "taskCell", for: indexPath) as! TaskCell
        
        cell.taskNameLabel.text = tasks[indexPath.row].name
        
        if tasks[indexPath.row].checked {
            cell.checkBoxOutlet.setBackgroundImage(filled, for: UIControl.State.normal)
        } else {
            cell.checkBoxOutlet.setBackgroundImage(empty, for: UIControl.State.normal)
        }
        
        cell.delegate = self
        cell.indexP = indexPath.row
        cell.tasks = tasks
        
        return cell
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        let vc = segue.destination as! AddTaskController
        vc.delegate = self 
    }
    
    func addTask(name: String) {
        tasks.append(Task(name: name))
        tableView.reloadData()
    }
    
    func changeButton(checked: Bool, index: Int) {
        tasks[index].checked = checked
        tableView.reloadData()
        
    }

}

class Task {
    var name = ""
    var checked = false
    
    convenience init(name: String) {
        self.init()
        self.name = name
    }
}


