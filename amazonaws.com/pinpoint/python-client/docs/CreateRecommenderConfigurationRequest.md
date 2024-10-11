# CreateRecommenderConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create_recommender_configuration** | [**CreateRecommenderConfigurationRequestCreateRecommenderConfiguration**](CreateRecommenderConfigurationRequestCreateRecommenderConfiguration.md) |  | 

## Example

```python
from openapi_client.models.create_recommender_configuration_request import CreateRecommenderConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateRecommenderConfigurationRequest from a JSON string
create_recommender_configuration_request_instance = CreateRecommenderConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(CreateRecommenderConfigurationRequest.to_json())

# convert the object into a dict
create_recommender_configuration_request_dict = create_recommender_configuration_request_instance.to_dict()
# create an instance of CreateRecommenderConfigurationRequest from a dict
create_recommender_configuration_request_from_dict = CreateRecommenderConfigurationRequest.from_dict(create_recommender_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


