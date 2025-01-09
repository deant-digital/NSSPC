use std::io::stdin;
use std::str::FromStr;

fn read<F: FromStr>() -> F {
    let mut input = String::new();
    stdin().read_line(&mut input).unwrap();
    input.trim().parse().unwrap()
}

fn main() {
    let n: usize = read();
    let mut is_prime = vec![true; n + 1];
    let mut largest_prime = 2;
    for i in 2..=n {
        if is_prime[i] {
            largest_prime = i;
            let mut j = i * i;
            while (j <= n) {
                is_prime[j] = false;
                j += i
            }
        }
    }
    println!("{}", largest_prime)
}
