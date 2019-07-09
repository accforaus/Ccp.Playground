/**
 * A class that assign common keys & values about robot such as cleaningRobot, dogRobot and so on.
 * Only information that all robots would have in common is included such as ID, type, name, price, initial position and so on.
 *
 * <p>
 *     inherit to CleaningRobot, DogRobot, RobotManager
 *     including method called 'move' that change the location in the room with size 200 X 200 according to the inserted data
            => will be used in the method 'changeLocation' in class RobotManager
 * </p>
 *
 * @author Yeonwoo Choi
 * @see cleaning_robot & dog_robot & robot_manager
 */
class Robot {

    constructor() {
        this.robotId = 0
        this.robotKind = ''
        this.robotName = ''
        this.robotLocationX = 0
        this.robotLocationY = 0
        this.robotDistance = 0
        this.robotPrice = 0
    }

    /**
     * A method that change the location according to the inserted data
     * @param up
     * @param down
     * @param left
     * @param right
     */
    move (up, down, left, right) {
        if (this.robotLocationX + (right - left) > -1 && this.robotLocationY + (up - down) > -1 && this.robotLocationX + (right - left) < 201 && this.robotLocationY + (up - down) < 201) {
            this.robotLocationY += (up - down)
            this.robotLocationX += (right - left)
        }
        if (this.robotLocationX + (right - left) >= 200) {
            this.robotLocationX = 200
        }
        if (this.robotLocationY + (up - down) >= 200) {
            this.robotLocationY = 200
        }
        if (this.robotLocationX + (right - left) <= 0) {
            this.robotLocationX = 0
        }
        if (this.robotLocationY + (up - down) <= 0) {
            this.robotLocationY = 0
        }
    }
}

module.exports = Robot
