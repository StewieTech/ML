import scipy.stats as stats

# Define the parameters
n = 5  # Number of trials
p = 0.5  # Probability of success

# Calculate the binomial PMF for each possible outcome (0 to n)
binomial_pmf = [stats.binom.pmf(k, n, p) for k in range(n + 1)]

# Print the probabilities for each outcome
for k, probability in enumerate(binomial_pmf):
    print(f'P(X = {k}) = {probability:.4f}')