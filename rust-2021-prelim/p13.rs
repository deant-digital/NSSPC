use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let mut array = [0; 7];
    for i in 0..7 {
        array[i] = read();
    }
    array.sort();
    println!("{:.2}", (array[2] + array[3] + array[4]) as f64 / 3.0)
}
