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

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics(BaseModel):
    """
    TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics
    """ # noqa: E501
    account_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskQueue resource.")
    cumulative: Optional[Any] = Field(default=None, description="An object that contains the cumulative statistics for the TaskQueue.")
    realtime: Optional[Any] = Field(default=None, description="An object that contains the real-time statistics for the TaskQueue.")
    task_queue_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the TaskQueue from which these statistics were calculated.")
    url: Optional[StrictStr] = Field(default=None, description="The absolute URL of the TaskQueue statistics resource.")
    workspace_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the Workspace that contains the TaskQueue.")
    __properties: ClassVar[List[str]] = ["account_sid", "cumulative", "realtime", "task_queue_sid", "url", "workspace_sid"]

    @field_validator('account_sid')
    def account_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^AC[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^AC[0-9a-fA-F]{32}$/")
        return value

    @field_validator('task_queue_sid')
    def task_queue_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WQ[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WQ[0-9a-fA-F]{32}$/")
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
        """Create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics from a JSON string"""
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

        # set to None if cumulative (nullable) is None
        # and model_fields_set contains the field
        if self.cumulative is None and "cumulative" in self.model_fields_set:
            _dict['cumulative'] = None

        # set to None if realtime (nullable) is None
        # and model_fields_set contains the field
        if self.realtime is None and "realtime" in self.model_fields_set:
            _dict['realtime'] = None

        # set to None if task_queue_sid (nullable) is None
        # and model_fields_set contains the field
        if self.task_queue_sid is None and "task_queue_sid" in self.model_fields_set:
            _dict['task_queue_sid'] = None

        # set to None if url (nullable) is None
        # and model_fields_set contains the field
        if self.url is None and "url" in self.model_fields_set:
            _dict['url'] = None

        # set to None if workspace_sid (nullable) is None
        # and model_fields_set contains the field
        if self.workspace_sid is None and "workspace_sid" in self.model_fields_set:
            _dict['workspace_sid'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "account_sid": obj.get("account_sid"),
            "cumulative": obj.get("cumulative"),
            "realtime": obj.get("realtime"),
            "task_queue_sid": obj.get("task_queue_sid"),
            "url": obj.get("url"),
            "workspace_sid": obj.get("workspace_sid")
        })
        return _obj


