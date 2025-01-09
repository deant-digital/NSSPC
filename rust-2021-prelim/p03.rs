use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let n: i32 = read();
    let mut sum = 0;
    let mut i = 1;
    while i * i <= n {
        if n % i == 0 {
            sum += i + n / i;
            if i * i == n {
                sum -= i;
            }
        }
        i += 1;
    }
    println!("{}", sum);
}
