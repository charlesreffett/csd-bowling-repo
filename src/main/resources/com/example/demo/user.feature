#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Bowling
  I want to use this template for my feature file

  @tag1
  Scenario: Total for One Frame ball1 2 pins and ball2 4 pins
    Given I am bowling
    When I knock down 2 pins on the first ball
    And 4 pins on the second ball
    Then the total will show 6

  @tag2
  Scenario Outline: Total for One Frame ball1 6 pins and ball2 4 pins
    Given I am bowling
    When I knock down 6 pins on the first ball
    And 4 pins on the second ball
    Then the total will show 10

#  @tag1
#  Scenario Outline: Total of Two Balls for One Frame
#    Given I am bowling2
#    When bowl
#      | ball1  | ball2 | total  |
#      | 2      | 4     | 6      |
#      | 6      | 4     | 10     |
#    Then total