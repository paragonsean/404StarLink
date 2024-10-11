# Announcement

Enterprise global announcement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcement** | **str** | The announcement text in GitHub Flavored Markdown. For more information about GitHub Flavored Markdown, see \&quot;[Basic writing and formatting syntax](https://docs.github.com/enterprise-server@3.4/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax).\&quot; | 
**expires_at** | **datetime** | The time at which the announcement expires. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. To set an announcement that never expires, omit this parameter, set it to &#x60;null&#x60;, or set it to an empty string. | [optional] 

## Example

```python
from openapi_client.models.announcement import Announcement

# TODO update the JSON string below
json = "{}"
# create an instance of Announcement from a JSON string
announcement_instance = Announcement.from_json(json)
# print the JSON string representation of the object
print(Announcement.to_json())

# convert the object into a dict
announcement_dict = announcement_instance.to_dict()
# create an instance of Announcement from a dict
announcement_from_dict = Announcement.from_dict(announcement_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


