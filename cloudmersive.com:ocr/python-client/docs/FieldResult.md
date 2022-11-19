# FieldResult

A pairing target field and actual value read from form

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field_values** | [**List[OcrPhotoTextElement]**](OcrPhotoTextElement.md) | Result field value(s) extracted | [optional] 
**target_field** | [**FormFieldDefinition**](FormFieldDefinition.md) |  | [optional] 

## Example

```python
from openapi_client.models.field_result import FieldResult

# TODO update the JSON string below
json = "{}"
# create an instance of FieldResult from a JSON string
field_result_instance = FieldResult.from_json(json)
# print the JSON string representation of the object
print(FieldResult.to_json())

# convert the object into a dict
field_result_dict = field_result_instance.to_dict()
# create an instance of FieldResult from a dict
field_result_from_dict = FieldResult.from_dict(field_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


