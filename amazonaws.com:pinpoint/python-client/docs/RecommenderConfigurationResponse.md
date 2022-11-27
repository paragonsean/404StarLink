# RecommenderConfigurationResponse

Provides information about Amazon Pinpoint configuration settings for retrieving and processing data from a recommender model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**creation_date** | **str** |  | 
**description** | **str** |  | [optional] 
**id** | **str** |  | 
**last_modified_date** | **str** |  | 
**name** | **str** |  | [optional] 
**recommendation_provider_id_type** | **str** |  | [optional] 
**recommendation_provider_role_arn** | **str** |  | 
**recommendation_provider_uri** | **str** |  | 
**recommendation_transformer_uri** | **str** |  | [optional] 
**recommendations_display_name** | **str** |  | [optional] 
**recommendations_per_message** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.recommender_configuration_response import RecommenderConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of RecommenderConfigurationResponse from a JSON string
recommender_configuration_response_instance = RecommenderConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(RecommenderConfigurationResponse.to_json())

# convert the object into a dict
recommender_configuration_response_dict = recommender_configuration_response_instance.to_dict()
# create an instance of RecommenderConfigurationResponse from a dict
recommender_configuration_response_from_dict = RecommenderConfigurationResponse.from_dict(recommender_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


