# UpdateRecommenderConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommender_configuration_response** | [**RecommenderConfigurationResponse**](RecommenderConfigurationResponse.md) |  | 

## Example

```python
from openapi_client.models.update_recommender_configuration_response import UpdateRecommenderConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateRecommenderConfigurationResponse from a JSON string
update_recommender_configuration_response_instance = UpdateRecommenderConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateRecommenderConfigurationResponse.to_json())

# convert the object into a dict
update_recommender_configuration_response_dict = update_recommender_configuration_response_instance.to_dict()
# create an instance of UpdateRecommenderConfigurationResponse from a dict
update_recommender_configuration_response_from_dict = UpdateRecommenderConfigurationResponse.from_dict(update_recommender_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


