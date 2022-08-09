# Schur Number

Schur Number is how long we can color natural numbers and avoid monochromatic solution of equation $a = b + c$. This backtracking algorithm using stack finds all solutions for a given number of colors.

For 2 colors Schur Number is 4. These are the 2 solutions,

    [1001, 0110]

For 3 colors Schur Number is 13. These are the 18 solutions.

    [0110220220110, 0110221220110, 0110222220110, 0220110110220, 0220111110220, 0220112110220, 
    1001220221001, 1001221221001, 1001222221001, 1221000001221, 1221001001221, 1221002001221, 
    2002110112002, 2002111112002, 2002112112002, 2112000002112, 2112001002112, 2112002002112]

For 4 colors Schur Number is 44. These are the 6552 solutions.

    [ 01020211333323030102122120103232133311202010 ... 32313122000010303231211213230101200022131323]
    
For 5 colors Schur Number is 160. There are (yet to be calculate) solutions.

# How to run the program

Change the `numOfColor` variable to the desired number of color and then either 

- Run the `App.java` file
- or run the Gradle build file

# Todo

CPU utilization sits at 20%. I think cache miss is the probable cause.
