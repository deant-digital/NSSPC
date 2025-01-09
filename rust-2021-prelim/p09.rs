use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn gcd(mut x: i32, mut y: i32) -> i32 {
    while x != 0 {
        let t = x;
        x = y % x;
        y = t;
    }
    y
}

fn lcm(x: i32, y: i32) -> i32 {
    x / gcd(x, y) * y
}

fn main() {
    let x: i32 = read();
    let y: i32 = read();
    let z: i32 = read();
    println!("{}", lcm(x, lcm(y, z)));
}
