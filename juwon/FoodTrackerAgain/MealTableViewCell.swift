//
//  MealTableViewCell.swift
//  FoodTrackerAgain
//
//  Created by Juwon Lee on 8/3/19.
//  Copyright © 2019 Juwon Lee. All rights reserved.
//

import UIKit

class MealTableViewCell: UITableViewCell {

    //mark: Properties
    
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var photoImageView: UIImageView!
    @IBOutlet weak var ratingControl: RatingControl!
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }
    
    

}
