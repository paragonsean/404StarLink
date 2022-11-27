# GetRecommenderConfigurationsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**list_recommender_configurations_response** | [**ListRecommenderConfigurationsResponse**](ListRecommenderConfigurationsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_recommender_configurations_response import GetRecommenderConfigurationsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetRecommenderConfigurationsResponse from a JSON string
get_recommender_configurations_response_instance = GetRecommenderConfigurationsResponse.from_json(json)
# print the JSON string representation of the object
print(GetRecommenderConfigurationsResponse.to_json())

# convert the object into a dict
get_recommender_configurations_response_dict = get_recommender_configurations_response_instance.to_dict()
# create an instance of GetRecommenderConfigurationsResponse from a dict
get_recommender_configurations_response_from_dict = GetRecommenderConfigurationsResponse.from_dict(get_recommender_configurations_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


