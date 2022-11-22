# Accuracy

The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information that you specified instead of the position computed by solver.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**horizontal_accuracy** | **float** |  | [optional] 
**vertical_accuracy** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.accuracy import Accuracy

# TODO update the JSON string below
json = "{}"
# create an instance of Accuracy from a JSON string
accuracy_instance = Accuracy.from_json(json)
# print the JSON string representation of the object
print(Accuracy.to_json())

# convert the object into a dict
accuracy_dict = accuracy_instance.to_dict()
# create an instance of Accuracy from a dict
accuracy_from_dict = Accuracy.from_dict(accuracy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


