package resolvehw3.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument{
    private int numberOfStrings;
   @Override
   public void play() {
       System.out.println("This guitar plays! And it's number of strings:"+ getNumberOfStrings());
   }
};


