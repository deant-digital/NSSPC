use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let x: i32 = read();
    let y: i32 = read();
    if (y % 2 != 0 || x * 2 > y || x * 4 < y) {
        println!("No feasible solution");
        return;
    }
    println!("{} {}", x * 2 - y / 2, y / 2 - x)
}
