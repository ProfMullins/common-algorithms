#!/usr/bin/env perl

my @int_arr = (4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9);

my @char_arr = ('a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
               'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f');


sub sort_arr {
    my @arr = @_;

    my $len = scalar(@arr);
    
    my $sorted = 0;

    while ( not $sorted ) {
        $sorted = 1; # Innocent until proven guilty.

        for my $curr ( 1 .. $len) {
            my $prev = $curr - 1;

            if ( $arr[$curr] < $arr[$prev] ) {
                ($arr[$curr], $arr[$prev]) = ($arr[$prev], $arr[$curr]);

                $sorted = 0;
            }
        }
    }

    print_arr(@arr);
}

sub sort_char {
    my @arr = @_;
    
    my $len = scalar(@arr);

    my $sorted = 0;

    while ( not $sorted ) {
        $sorted = 1; # Innocent until proven guilty.

        for my $curr ( 1 .. $len) {
            my $prev = $curr - 1;

            my $comp = $arr[$curr] cmp $arr[$prev];
   	    if ($comp == -1) {
                ($arr[$curr], $arr[$prev]) = ($arr[$prev], $arr[$curr]);

                $sorted = 0;
            }
        }
    }

    print_arr(@arr);
}



sub print_arr {
    my @arr = @_;

    foreach my $item (@arr) {
	print $item . ", ";
    }

    print("\n");
}


print("Unsorted Int Array:\n");
print_arr(@int_arr);
print("Sorted Int Array:\n");
sort_arr(@int_arr);

print("\n");

print("Unsorted Char Array:\n");
print_arr(@char_arr);
print("Sorted Char Array:\n");
sort_char(@char_arr);

