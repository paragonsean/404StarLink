# DeliveryPredictionInLanguage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **str** |  | [optional] 
**late** | **bool** | true for late, false for on-time delivery | [optional] 
**probability** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.delivery_prediction_in_language import DeliveryPredictionInLanguage

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryPredictionInLanguage from a JSON string
delivery_prediction_in_language_instance = DeliveryPredictionInLanguage.from_json(json)
# print the JSON string representation of the object
print(DeliveryPredictionInLanguage.to_json())

# convert the object into a dict
delivery_prediction_in_language_dict = delivery_prediction_in_language_instance.to_dict()
# create an instance of DeliveryPredictionInLanguage from a dict
delivery_prediction_in_language_from_dict = DeliveryPredictionInLanguage.from_dict(delivery_prediction_in_language_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


