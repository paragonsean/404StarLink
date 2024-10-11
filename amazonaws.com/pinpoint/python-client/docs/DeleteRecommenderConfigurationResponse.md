# DeleteRecommenderConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommender_configuration_response** | [**RecommenderConfigurationResponse**](RecommenderConfigurationResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_recommender_configuration_response import DeleteRecommenderConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteRecommenderConfigurationResponse from a JSON string
delete_recommender_configuration_response_instance = DeleteRecommenderConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteRecommenderConfigurationResponse.to_json())

# convert the object into a dict
delete_recommender_configuration_response_dict = delete_recommender_configuration_response_instance.to_dict()
# create an instance of DeleteRecommenderConfigurationResponse from a dict
delete_recommender_configuration_response_from_dict = DeleteRecommenderConfigurationResponse.from_dict(delete_recommender_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


