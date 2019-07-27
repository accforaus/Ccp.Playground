class LinkedList <T> {
    private var head = Node <T?> (null, null, null)
    private var tail = Node <T?> (null, null, null)
    var count = 0

    fun push(input: T) {
        count += 1
        if (head.next == null) {
            head.next = Node(input, head, tail)
            tail.prev = head.next
        }
        else {
            val temp = Node (input, tail.prev, tail)
            tail.prev?.next = temp
            tail.prev = temp
        }
    }

    fun pop() : T? {
        count += -1
        val temp = tail.prev?.data
        tail.prev = tail.prev?.prev
        tail.prev?.next = tail
        return temp
    }

    fun shift() : T? {
        count += -1
        val temp = head.next?.data
        head.next = head.next?.next
        head.next?.prev = head
        return temp
    }

    fun unshift(input: T) {
        count += 1
        if (head.next == null) {
            head.next = Node(input, head, tail)
            tail.prev = head.next
        }
        else {
            val temp = Node (input, head, head.next)
            head.next?.prev = temp
            head.next = temp
        }
    }

    fun delete(target: T) {
        var current = head.next
        while (current != null) {
            if (current.data == target ) {
                count += -1
                current.prev?.next = current.next
                current.next?.prev = current.prev

            }
            current = current.next
        }
    }

}