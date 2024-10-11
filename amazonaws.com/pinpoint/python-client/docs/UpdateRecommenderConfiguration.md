# UpdateRecommenderConfiguration

Specifies Amazon Pinpoint configuration settings for retrieving and processing recommendation data from a recommender model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**description** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**recommendation_provider_id_type** | **str** |  | [optional] 
**recommendation_provider_role_arn** | **str** |  | 
**recommendation_provider_uri** | **str** |  | 
**recommendation_transformer_uri** | **str** |  | [optional] 
**recommendations_display_name** | **str** |  | [optional] 
**recommendations_per_message** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.update_recommender_configuration import UpdateRecommenderConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateRecommenderConfiguration from a JSON string
update_recommender_configuration_instance = UpdateRecommenderConfiguration.from_json(json)
# print the JSON string representation of the object
print(UpdateRecommenderConfiguration.to_json())

# convert the object into a dict
update_recommender_configuration_dict = update_recommender_configuration_instance.to_dict()
# create an instance of UpdateRecommenderConfiguration from a dict
update_recommender_configuration_from_dict = UpdateRecommenderConfiguration.from_dict(update_recommender_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


