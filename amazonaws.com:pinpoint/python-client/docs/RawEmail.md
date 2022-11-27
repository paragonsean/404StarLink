# RawEmail

Specifies the contents of an email message, represented as a raw MIME message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.raw_email import RawEmail

# TODO update the JSON string below
json = "{}"
# create an instance of RawEmail from a JSON string
raw_email_instance = RawEmail.from_json(json)
# print the JSON string representation of the object
print(RawEmail.to_json())

# convert the object into a dict
raw_email_dict = raw_email_instance.to_dict()
# create an instance of RawEmail from a dict
raw_email_from_dict = RawEmail.from_dict(raw_email_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


