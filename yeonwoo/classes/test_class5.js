class Song {
    constructor (title, artist, year, country) {
        this.title = title
        this.artist = artist
        this.year = year
        this.country = country
    }

    show() {
        return `${this.year}년 ${this.country}국적의 ${this.artist}가 부른 ${this.title}`
    }
}

mySong = new Song('Dancing Queen', 'ABBA', 1978,'스웨덴')
console.log(mySong.show())