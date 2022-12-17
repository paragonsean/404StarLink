# coding: utf-8

"""
    Twilio - Taskrouter

    This is the public Twilio REST API.

    The version of the OpenAPI document: 1.42.0
    Contact: support@twilio.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class TaskrouterV1WorkspaceTask(BaseModel):
    """
    TaskrouterV1WorkspaceTask
    """ # noqa: E501
    account_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Task resource.")
    addons: Optional[StrictStr] = Field(default=None, description="An object that contains the [addon](https://www.twilio.com/docs/taskrouter/marketplace) data for all installed addons.")
    age: Optional[StrictInt] = Field(default=None, description="The number of seconds since the Task was created.")
    assignment_status: Optional[StrictStr] = None
    attributes: Optional[StrictStr] = Field(default=None, description="The JSON string with custom attributes of the work. **Note** If this property has been assigned a value, it will only be displayed in FETCH action that returns a single resource. Otherwise, it will be null.")
    date_created: Optional[datetime] = Field(default=None, description="The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.")
    date_updated: Optional[datetime] = Field(default=None, description="The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.")
    links: Optional[Dict[str, Any]] = Field(default=None, description="The URLs of related resources.")
    priority: Optional[StrictInt] = Field(default=None, description="The current priority score of the Task as assigned to a Worker by the workflow. Tasks with higher priority values will be assigned before Tasks with lower values.")
    reason: Optional[StrictStr] = Field(default=None, description="The reason the Task was canceled or completed, if applicable.")
    sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The unique string that we created to identify the Task resource.")
    task_channel_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the TaskChannel.")
    task_channel_unique_name: Optional[StrictStr] = Field(default=None, description="The unique name of the TaskChannel.")
    task_queue_entered_date: Optional[datetime] = Field(default=None, description="The date and time in GMT when the Task entered the TaskQueue, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.")
    task_queue_friendly_name: Optional[StrictStr] = Field(default=None, description="The friendly name of the TaskQueue.")
    task_queue_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the TaskQueue.")
    timeout: Optional[StrictInt] = Field(default=None, description="The amount of time in seconds that the Task can live before being assigned.")
    url: Optional[StrictStr] = Field(default=None, description="The absolute URL of the Task resource.")
    workflow_friendly_name: Optional[StrictStr] = Field(default=None, description="The friendly name of the Workflow that is controlling the Task.")
    workflow_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the Workflow that is controlling the Task.")
    workspace_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the Workspace that contains the Task.")
    __properties: ClassVar[List[str]] = ["account_sid", "addons", "age", "assignment_status", "attributes", "date_created", "date_updated", "links", "priority", "reason", "sid", "task_channel_sid", "task_channel_unique_name", "task_queue_entered_date", "task_queue_friendly_name", "task_queue_sid", "timeout", "url", "workflow_friendly_name", "workflow_sid", "workspace_sid"]

    @field_validator('account_sid')
    def account_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^AC[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^AC[0-9a-fA-F]{32}$/")
        return value

    @field_validator('sid')
    def sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WT[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WT[0-9a-fA-F]{32}$/")
        return value

    @field_validator('task_channel_sid')
    def task_channel_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^TC[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^TC[0-9a-fA-F]{32}$/")
        return value

    @field_validator('task_queue_sid')
    def task_queue_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WQ[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WQ[0-9a-fA-F]{32}$/")
        return value

    @field_validator('workflow_sid')
    def workflow_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WW[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WW[0-9a-fA-F]{32}$/")
        return value

    @field_validator('workspace_sid')
    def workspace_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WS[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WS[0-9a-fA-F]{32}$/")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of TaskrouterV1WorkspaceTask from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # set to None if account_sid (nullable) is None
        # and model_fields_set contains the field
        if self.account_sid is None and "account_sid" in self.model_fields_set:
            _dict['account_sid'] = None

        # set to None if addons (nullable) is None
        # and model_fields_set contains the field
        if self.addons is None and "addons" in self.model_fields_set:
            _dict['addons'] = None

        # set to None if age (nullable) is None
        # and model_fields_set contains the field
        if self.age is None and "age" in self.model_fields_set:
            _dict['age'] = None

        # set to None if attributes (nullable) is None
        # and model_fields_set contains the field
        if self.attributes is None and "attributes" in self.model_fields_set:
            _dict['attributes'] = None

        # set to None if date_created (nullable) is None
        # and model_fields_set contains the field
        if self.date_created is None and "date_created" in self.model_fields_set:
            _dict['date_created'] = None

        # set to None if date_updated (nullable) is None
        # and model_fields_set contains the field
        if self.date_updated is None and "date_updated" in self.model_fields_set:
            _dict['date_updated'] = None

        # set to None if links (nullable) is None
        # and model_fields_set contains the field
        if self.links is None and "links" in self.model_fields_set:
            _dict['links'] = None

        # set to None if priority (nullable) is None
        # and model_fields_set contains the field
        if self.priority is None and "priority" in self.model_fields_set:
            _dict['priority'] = None

        # set to None if reason (nullable) is None
        # and model_fields_set contains the field
        if self.reason is None and "reason" in self.model_fields_set:
            _dict['reason'] = None

        # set to None if sid (nullable) is None
        # and model_fields_set contains the field
        if self.sid is None and "sid" in self.model_fields_set:
            _dict['sid'] = None

        # set to None if task_channel_sid (nullable) is None
        # and model_fields_set contains the field
        if self.task_channel_sid is None and "task_channel_sid" in self.model_fields_set:
            _dict['task_channel_sid'] = None

        # set to None if task_channel_unique_name (nullable) is None
        # and model_fields_set contains the field
        if self.task_channel_unique_name is None and "task_channel_unique_name" in self.model_fields_set:
            _dict['task_channel_unique_name'] = None

        # set to None if task_queue_entered_date (nullable) is None
        # and model_fields_set contains the field
        if self.task_queue_entered_date is None and "task_queue_entered_date" in self.model_fields_set:
            _dict['task_queue_entered_date'] = None

        # set to None if task_queue_friendly_name (nullable) is None
        # and model_fields_set contains the field
        if self.task_queue_friendly_name is None and "task_queue_friendly_name" in self.model_fields_set:
            _dict['task_queue_friendly_name'] = None

        # set to None if task_queue_sid (nullable) is None
        # and model_fields_set contains the field
        if self.task_queue_sid is None and "task_queue_sid" in self.model_fields_set:
            _dict['task_queue_sid'] = None

        # set to None if timeout (nullable) is None
        # and model_fields_set contains the field
        if self.timeout is None and "timeout" in self.model_fields_set:
            _dict['timeout'] = None

        # set to None if url (nullable) is None
        # and model_fields_set contains the field
        if self.url is None and "url" in self.model_fields_set:
            _dict['url'] = None

        # set to None if workflow_friendly_name (nullable) is None
        # and model_fields_set contains the field
        if self.workflow_friendly_name is None and "workflow_friendly_name" in self.model_fields_set:
            _dict['workflow_friendly_name'] = None

        # set to None if workflow_sid (nullable) is None
        # and model_fields_set contains the field
        if self.workflow_sid is None and "workflow_sid" in self.model_fields_set:
            _dict['workflow_sid'] = None

        # set to None if workspace_sid (nullable) is None
        # and model_fields_set contains the field
        if self.workspace_sid is None and "workspace_sid" in self.model_fields_set:
            _dict['workspace_sid'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TaskrouterV1WorkspaceTask from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "account_sid": obj.get("account_sid"),
            "addons": obj.get("addons"),
            "age": obj.get("age"),
            "assignment_status": obj.get("assignment_status"),
            "attributes": obj.get("attributes"),
            "date_created": obj.get("date_created"),
            "date_updated": obj.get("date_updated"),
            "links": obj.get("links"),
            "priority": obj.get("priority"),
            "reason": obj.get("reason"),
            "sid": obj.get("sid"),
            "task_channel_sid": obj.get("task_channel_sid"),
            "task_channel_unique_name": obj.get("task_channel_unique_name"),
            "task_queue_entered_date": obj.get("task_queue_entered_date"),
            "task_queue_friendly_name": obj.get("task_queue_friendly_name"),
            "task_queue_sid": obj.get("task_queue_sid"),
            "timeout": obj.get("timeout"),
            "url": obj.get("url"),
            "workflow_friendly_name": obj.get("workflow_friendly_name"),
            "workflow_sid": obj.get("workflow_sid"),
            "workspace_sid": obj.get("workspace_sid")
        })
        return _obj


