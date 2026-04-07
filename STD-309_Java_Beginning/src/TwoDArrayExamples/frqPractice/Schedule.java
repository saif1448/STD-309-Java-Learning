package TwoDArrayExamples.frqPractice;

public class Schedule
{
    private Appointment[][] sched;

    public Schedule(Appointment[][] sched)
    {
        this.sched = sched;
    }

    /**
     * Returns the index of a column containing the fewest
     * occurrences of the status indicated by the parameter target
     * Preconditions: sched is not null and no elements
     * of sched are null.
     * sched has at least one row and at least one column.
     */
    public int columnWithFewest(String target)
    {
        int minCount = Integer.MAX_VALUE;
        int minCountColIdx = 0;

        for(int j = 0; j < sched[0].length; j++){
            int count = 0;
            for(int i = 0; i < sched.length; i++){
                if(sched[i][j].getStatus().equals(target)){
                    count++;
                }
            }
            if(count < minCount){
                minCountColIdx = j;
                minCount = count;
            }
        }

        return minCountColIdx;
    }


    public static void main(String[] args)
    {
        Appointment[][] sched = {
                { new Appointment("free", 100), new Appointment("free", 100), new Appointment("free", 100), new Appointment("busy", 206), new Appointment("busy", 204) },
                { new Appointment("free", 100), new Appointment("free", 100), new Appointment("busy", 304), new Appointment("busy", 206), new Appointment("busy", 202) },
                { new Appointment("hold", 201), new Appointment("busy", 105), new Appointment("busy", 205), new Appointment("free", 100), new Appointment("busy", 205) },
                { new Appointment("busy", 204), new Appointment("free", 100), new Appointment("busy", 310), new Appointment("hold", 110), new Appointment("free", 100) },
                { new Appointment("busy", 204), new Appointment("hold", 201), new Appointment("hold", 310), new Appointment("busy", 105), new Appointment("free", 100) },
                { new Appointment("busy", 105), new Appointment("busy", 208), new Appointment("hold", 310), new Appointment("busy", 105), new Appointment("free", 100) }
        };


        Schedule schedule = new Schedule(sched);
        int columnIndex = schedule.columnWithFewest("busy");
        System.out.println("Column with fewest 'busy' should be 1: " + columnIndex);
        columnIndex = schedule.columnWithFewest("free");
        System.out.println("Column with fewest 'free' should be 2 or 3: " + columnIndex);
        columnIndex = schedule.columnWithFewest("hold");
        System.out.println("Column with fewest 'hold' should be 4: " + columnIndex);

        
    }
}

class Appointment
{
    private String status;
    private int roomNumber;

    public Appointment(String status, int roomNumber)
    {
        this.status = status;
        this.roomNumber = roomNumber;
    }

    public String getStatus()
    {
        return status;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }
}

