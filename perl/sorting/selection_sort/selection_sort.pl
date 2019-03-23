#!/usr/bin/env perl

my @int_arr = (4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9);

my @char_arr = ('a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
               'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f');


sub sort_arr {
    my @arr = @_;
    my $len = scalar(@arr);
    my $min;

    # Loop through unsorted array
    for (my $i = 0; $i < $len; $i++) {
    for (my $i = 0; $i < $len; $i++) {
	# Find min in unsorted array
	for (my $j = $i + 1; $j < $len; $j++) {
	    if ($arr[$j] < $arr[$i]) {
        	# Swap min element with first element
		$min = $arr[$j];
		$arr[$j] = $arr[$i];
		$arr[$i] = $min;
	    }
	}

	break;
    }

    print_arr(@arr);
}

sub sort_char {
    my @arr = @_;
    my $len = scalar(@arr);
    my $min;

    # Loop through unsorted array
    for (my $i = 0; $i < $len; $i++) {
	# Find min in unsorted array
	for (my $j = $i + 1; $j < $len; $j++) {
	    my $comp = $arr[$j] cmp $arr[$i];
	    if ($comp == -1) {
        	# Swap min element with first element
		$min = $arr[$j];
		$arr[$j] = $arr[$i];
		$arr[$i] = $min;
	    }
	}

	break;
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


print_arr(@int_arr);
sort_arr(@int_arr);

print("\n");

print_arr(@char_arr);
sort_char(@char_arr);

