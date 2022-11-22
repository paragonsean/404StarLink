# PutResourceLogLevelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**log_level** | **str** | The log level for a log message. The log levels can be disabled, or set to &lt;code&gt;ERROR&lt;/code&gt; to display less verbose logs containing only error information, or to &lt;code&gt;INFO&lt;/code&gt; for more detailed logs. | 

## Example

```python
from openapi_client.models.put_resource_log_level_request import PutResourceLogLevelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutResourceLogLevelRequest from a JSON string
put_resource_log_level_request_instance = PutResourceLogLevelRequest.from_json(json)
# print the JSON string representation of the object
print(PutResourceLogLevelRequest.to_json())

# convert the object into a dict
put_resource_log_level_request_dict = put_resource_log_level_request_instance.to_dict()
# create an instance of PutResourceLogLevelRequest from a dict
put_resource_log_level_request_from_dict = PutResourceLogLevelRequest.from_dict(put_resource_log_level_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


