# UpdateRecommenderConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_recommender_configuration** | [**CreateRecommenderConfigurationRequestCreateRecommenderConfiguration**](CreateRecommenderConfigurationRequestCreateRecommenderConfiguration.md) |  | 

## Example

```python
from openapi_client.models.update_recommender_configuration_request import UpdateRecommenderConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateRecommenderConfigurationRequest from a JSON string
update_recommender_configuration_request_instance = UpdateRecommenderConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateRecommenderConfigurationRequest.to_json())

# convert the object into a dict
update_recommender_configuration_request_dict = update_recommender_configuration_request_instance.to_dict()
# create an instance of UpdateRecommenderConfigurationRequest from a dict
update_recommender_configuration_request_from_dict = UpdateRecommenderConfigurationRequest.from_dict(update_recommender_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


