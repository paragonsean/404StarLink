# DeliveryPredictionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**List[DeliveryPredictionInLanguage]**](DeliveryPredictionInLanguage.md) |  | [optional] 

## Example

```python
from openapi_client.models.delivery_prediction_response import DeliveryPredictionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryPredictionResponse from a JSON string
delivery_prediction_response_instance = DeliveryPredictionResponse.from_json(json)
# print the JSON string representation of the object
print(DeliveryPredictionResponse.to_json())

# convert the object into a dict
delivery_prediction_response_dict = delivery_prediction_response_instance.to_dict()
# create an instance of DeliveryPredictionResponse from a dict
delivery_prediction_response_from_dict = DeliveryPredictionResponse.from_dict(delivery_prediction_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


