# SimpleEmailPart

Specifies the subject or body of an email message, represented as textual email data and the applicable character set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charset** | **str** |  | [optional] 
**data** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.simple_email_part import SimpleEmailPart

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleEmailPart from a JSON string
simple_email_part_instance = SimpleEmailPart.from_json(json)
# print the JSON string representation of the object
print(SimpleEmailPart.to_json())

# convert the object into a dict
simple_email_part_dict = simple_email_part_instance.to_dict()
# create an instance of SimpleEmailPart from a dict
simple_email_part_from_dict = SimpleEmailPart.from_dict(simple_email_part_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


