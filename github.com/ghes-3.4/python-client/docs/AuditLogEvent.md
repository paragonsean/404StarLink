# AuditLogEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **int** | The time the audit log event occurred, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time). | [optional] 
**document_id** | **str** | A unique identifier for an audit event. | [optional] 
**action** | **str** | The name of the action that was performed, for example &#x60;user.login&#x60; or &#x60;repo.create&#x60;. | [optional] 
**active** | **bool** |  | [optional] 
**active_was** | **bool** |  | [optional] 
**actor** | **str** | The actor who performed the action. | [optional] 
**actor_id** | **int** | The id of the actor who performed the action. | [optional] 
**actor_location** | [**AuditLogEventActorLocation**](AuditLogEventActorLocation.md) |  | [optional] 
**blocked_user** | **str** | The username of the account being blocked. | [optional] 
**business** | **str** |  | [optional] 
**business_id** | **int** |  | [optional] 
**config** | **List[object]** |  | [optional] 
**config_was** | **List[object]** |  | [optional] 
**content_type** | **str** |  | [optional] 
**created_at** | **int** | The time the audit log event was recorded, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time). | [optional] 
**data** | **Dict[str, object]** |  | [optional] 
**deploy_key_fingerprint** | **str** |  | [optional] 
**emoji** | **str** |  | [optional] 
**events** | **List[object]** |  | [optional] 
**events_were** | **List[object]** |  | [optional] 
**explanation** | **str** |  | [optional] 
**fingerprint** | **str** |  | [optional] 
**hook_id** | **int** |  | [optional] 
**limited_availability** | **bool** |  | [optional] 
**message** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**old_user** | **str** |  | [optional] 
**openssh_public_key** | **str** |  | [optional] 
**operation_type** | **str** |  | [optional] 
**org** | **str** |  | [optional] 
**org_id** | **int** |  | [optional] 
**previous_visibility** | **str** |  | [optional] 
**read_only** | **bool** |  | [optional] 
**repo** | **str** | The name of the repository. | [optional] 
**repository** | **str** | The name of the repository. | [optional] 
**repository_public** | **bool** |  | [optional] 
**target_login** | **str** |  | [optional] 
**team** | **str** |  | [optional] 
**transport_protocol** | **int** | The type of protocol (for example, HTTP or SSH) used to transfer Git data. | [optional] 
**transport_protocol_name** | **str** | A human readable name for the protocol (for example, HTTP or SSH) used to transfer Git data. | [optional] 
**user** | **str** | The user that was affected by the action performed (if available). | [optional] 
**user_id** | **int** |  | [optional] 
**visibility** | **str** | The repository visibility, for example &#x60;public&#x60; or &#x60;private&#x60;. | [optional] 

## Example

```python
from openapi_client.models.audit_log_event import AuditLogEvent

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogEvent from a JSON string
audit_log_event_instance = AuditLogEvent.from_json(json)
# print the JSON string representation of the object
print(AuditLogEvent.to_json())

# convert the object into a dict
audit_log_event_dict = audit_log_event_instance.to_dict()
# create an instance of AuditLogEvent from a dict
audit_log_event_from_dict = AuditLogEvent.from_dict(audit_log_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


