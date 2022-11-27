# CreateRecommenderConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommender_configuration_response** | [**RecommenderConfigurationResponse**](RecommenderConfigurationResponse.md) |  | 

## Example

```python
from openapi_client.models.create_recommender_configuration_response import CreateRecommenderConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateRecommenderConfigurationResponse from a JSON string
create_recommender_configuration_response_instance = CreateRecommenderConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(CreateRecommenderConfigurationResponse.to_json())

# convert the object into a dict
create_recommender_configuration_response_dict = create_recommender_configuration_response_instance.to_dict()
# create an instance of CreateRecommenderConfigurationResponse from a dict
create_recommender_configuration_response_from_dict = CreateRecommenderConfigurationResponse.from_dict(create_recommender_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


