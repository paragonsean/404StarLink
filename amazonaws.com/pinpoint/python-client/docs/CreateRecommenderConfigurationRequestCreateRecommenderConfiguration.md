# CreateRecommenderConfigurationRequestCreateRecommenderConfiguration

Specifies Amazon Pinpoint configuration settings for retrieving and processing recommendation data from a recommender model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**description** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**recommendation_provider_id_type** | **str** |  | [optional] 
**recommendation_provider_role_arn** | **str** |  | [optional] 
**recommendation_provider_uri** | **str** |  | [optional] 
**recommendation_transformer_uri** | **str** |  | [optional] 
**recommendations_display_name** | **str** |  | [optional] 
**recommendations_per_message** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_recommender_configuration_request_create_recommender_configuration import CreateRecommenderConfigurationRequestCreateRecommenderConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateRecommenderConfigurationRequestCreateRecommenderConfiguration from a JSON string
create_recommender_configuration_request_create_recommender_configuration_instance = CreateRecommenderConfigurationRequestCreateRecommenderConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateRecommenderConfigurationRequestCreateRecommenderConfiguration.to_json())

# convert the object into a dict
create_recommender_configuration_request_create_recommender_configuration_dict = create_recommender_configuration_request_create_recommender_configuration_instance.to_dict()
# create an instance of CreateRecommenderConfigurationRequestCreateRecommenderConfiguration from a dict
create_recommender_configuration_request_create_recommender_configuration_from_dict = CreateRecommenderConfigurationRequestCreateRecommenderConfiguration.from_dict(create_recommender_configuration_request_create_recommender_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


