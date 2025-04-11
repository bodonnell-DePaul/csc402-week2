package csc402.week2;

import java.util.HashMap;

  public class DNSResolver {
      private static HashMap<String, String> dnsTable = new HashMap<>();

      static {
          // Simulated DNS records
          dnsTable.put("www.depaul.edu", "192.168.1.1");
          dnsTable.put("example.edu", "192.168.1.2");
          dnsTable.put("com", "192.168.1.3");
      }

      public static String resolve(String domain) {
          if (dnsTable.containsKey(domain)) {
              return dnsTable.get(domain); // Base case: domain found
          }
          int dotIndex = domain.indexOf('.');
          if (dotIndex == -1) {
              return "Domain not found"; // Base case: no more subdomains
          }
          String parentDomain = domain.substring(dotIndex + 1);
          return resolve(parentDomain); // Recursive call to resolve parent domain
      }

      public static void main(String[] args) {
          String domain = "cdm.depaul.edu";
          String ip = resolve(domain);
          System.out.println("IP address for " + domain + ": " + ip);
      }
  }
