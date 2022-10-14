

# AutoMLConfig

When the solution performs AutoML (<code>performAutoML</code> is true in <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html\">CreateSolution</a>), Amazon Personalize determines which recipe, from the specified list, optimizes the given metric. Amazon Personalize then uses that recipe for the solution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metricName** | [**String**](String.md) |  |  [optional] |
|**recipeList** | [**List**](List.md) |  |  [optional] |



