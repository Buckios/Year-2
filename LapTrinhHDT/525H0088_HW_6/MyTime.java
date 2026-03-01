public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public MyTime(MyTime t) {
        if (t != null) {
            this.hour = t.hour;
            this.minute = t.minute;
            this.second = t.second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int h) {
        if (h >= 0 && h <= 23) {
            this.hour = h;
        }
    }

    public void setMinute(int m) {
        if (m >= 0 && m <= 59) {
            this.minute = m;
        }
    }

    public void setSecond(int s) {
        if (s >= 0 && s <= 59) {
            this.second = s;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        MyTime myTime = (MyTime) obj;
        
        if (hour != myTime.hour) return false;
        if (minute != myTime.minute) return false;
        return second == myTime.second;
    }

    public MyTime nextSecond() {
        int s = this.second + 1;
        int m = this.minute;
        int h = this.hour;

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        return new MyTime(h, m, s);
    }

    public MyTime previousSecond() {
        int s = this.second - 1;
        int m = this.minute;
        int h = this.hour;

        if (s == -1) {
            s = 59;
            m--;
        }
        if (m == -1) {
            m = 59;
            h--;
        }
        if (h == -1) {
            h = 23;
        }

        return new MyTime(h, m, s);
    }
}