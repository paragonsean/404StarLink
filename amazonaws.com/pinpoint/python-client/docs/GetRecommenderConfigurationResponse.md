# GetRecommenderConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommender_configuration_response** | [**RecommenderConfigurationResponse**](RecommenderConfigurationResponse.md) |  | 

## Example

```python
from openapi_client.models.get_recommender_configuration_response import GetRecommenderConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetRecommenderConfigurationResponse from a JSON string
get_recommender_configuration_response_instance = GetRecommenderConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(GetRecommenderConfigurationResponse.to_json())

# convert the object into a dict
get_recommender_configuration_response_dict = get_recommender_configuration_response_instance.to_dict()
# create an instance of GetRecommenderConfigurationResponse from a dict
get_recommender_configuration_response_from_dict = GetRecommenderConfigurationResponse.from_dict(get_recommender_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


