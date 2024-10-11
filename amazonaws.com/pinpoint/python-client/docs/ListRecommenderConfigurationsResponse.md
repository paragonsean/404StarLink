# ListRecommenderConfigurationsResponse

Provides information about all the recommender model configurations that are associated with your Amazon Pinpoint account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_recommender_configurations_response import ListRecommenderConfigurationsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListRecommenderConfigurationsResponse from a JSON string
list_recommender_configurations_response_instance = ListRecommenderConfigurationsResponse.from_json(json)
# print the JSON string representation of the object
print(ListRecommenderConfigurationsResponse.to_json())

# convert the object into a dict
list_recommender_configurations_response_dict = list_recommender_configurations_response_instance.to_dict()
# create an instance of ListRecommenderConfigurationsResponse from a dict
list_recommender_configurations_response_from_dict = ListRecommenderConfigurationsResponse.from_dict(list_recommender_configurations_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


