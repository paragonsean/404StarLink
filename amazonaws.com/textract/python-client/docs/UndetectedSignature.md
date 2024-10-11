# UndetectedSignature

A structure containing information about an undetected signature on a page where it was expected but not found.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.undetected_signature import UndetectedSignature

# TODO update the JSON string below
json = "{}"
# create an instance of UndetectedSignature from a JSON string
undetected_signature_instance = UndetectedSignature.from_json(json)
# print the JSON string representation of the object
print(UndetectedSignature.to_json())

# convert the object into a dict
undetected_signature_dict = undetected_signature_instance.to_dict()
# create an instance of UndetectedSignature from a dict
undetected_signature_from_dict = UndetectedSignature.from_dict(undetected_signature_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


