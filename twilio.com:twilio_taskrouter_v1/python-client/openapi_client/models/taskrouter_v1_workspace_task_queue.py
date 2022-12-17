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

class TaskrouterV1WorkspaceTaskQueue(BaseModel):
    """
    TaskrouterV1WorkspaceTaskQueue
    """ # noqa: E501
    account_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskQueue resource.")
    assignment_activity_name: Optional[StrictStr] = Field(default=None, description="The name of the Activity to assign Workers when a task is assigned for them.")
    assignment_activity_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the Activity to assign Workers when a task is assigned for them.")
    date_created: Optional[datetime] = Field(default=None, description="The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.")
    date_updated: Optional[datetime] = Field(default=None, description="The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format.")
    friendly_name: Optional[StrictStr] = Field(default=None, description="The string that you assigned to describe the resource.")
    links: Optional[Dict[str, Any]] = Field(default=None, description="The URLs of related resources.")
    max_reserved_workers: Optional[StrictInt] = Field(default=None, description="The maximum number of Workers to reserve for the assignment of a task in the queue. Can be an integer between 1 and 50, inclusive and defaults to 1.")
    reservation_activity_name: Optional[StrictStr] = Field(default=None, description="The name of the Activity to assign Workers once a task is reserved for them.")
    reservation_activity_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the Activity to assign Workers once a task is reserved for them.")
    sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The unique string that we created to identify the TaskQueue resource.")
    target_workers: Optional[StrictStr] = Field(default=None, description="A string describing the Worker selection criteria for any Tasks that enter the TaskQueue. For example `'\"language\" == \"spanish\"'` If no TargetWorkers parameter is provided, Tasks will wait in the TaskQueue until they are either deleted or moved to another TaskQueue. Additional examples on how to describing Worker selection criteria below. Defaults to 1==1.")
    task_order: Optional[StrictStr] = None
    url: Optional[StrictStr] = Field(default=None, description="The absolute URL of the TaskQueue resource.")
    workspace_sid: Optional[Annotated[str, Field(min_length=34, strict=True, max_length=34)]] = Field(default=None, description="The SID of the Workspace that contains the TaskQueue.")
    __properties: ClassVar[List[str]] = ["account_sid", "assignment_activity_name", "assignment_activity_sid", "date_created", "date_updated", "friendly_name", "links", "max_reserved_workers", "reservation_activity_name", "reservation_activity_sid", "sid", "target_workers", "task_order", "url", "workspace_sid"]

    @field_validator('account_sid')
    def account_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^AC[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^AC[0-9a-fA-F]{32}$/")
        return value

    @field_validator('assignment_activity_sid')
    def assignment_activity_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WA[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WA[0-9a-fA-F]{32}$/")
        return value

    @field_validator('reservation_activity_sid')
    def reservation_activity_sid_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^WA[0-9a-fA-F]{32}$", value):
            raise ValueError(r"must validate the regular expression /^WA[0-9a-fA-F]{32}$/")
        return value

    @field_validator('sid')
    def sid_validate_regular_expression(cls, value):
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
        """Create an instance of TaskrouterV1WorkspaceTaskQueue from a JSON string"""
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

        # set to None if assignment_activity_name (nullable) is None
        # and model_fields_set contains the field
        if self.assignment_activity_name is None and "assignment_activity_name" in self.model_fields_set:
            _dict['assignment_activity_name'] = None

        # set to None if assignment_activity_sid (nullable) is None
        # and model_fields_set contains the field
        if self.assignment_activity_sid is None and "assignment_activity_sid" in self.model_fields_set:
            _dict['assignment_activity_sid'] = None

        # set to None if date_created (nullable) is None
        # and model_fields_set contains the field
        if self.date_created is None and "date_created" in self.model_fields_set:
            _dict['date_created'] = None

        # set to None if date_updated (nullable) is None
        # and model_fields_set contains the field
        if self.date_updated is None and "date_updated" in self.model_fields_set:
            _dict['date_updated'] = None

        # set to None if friendly_name (nullable) is None
        # and model_fields_set contains the field
        if self.friendly_name is None and "friendly_name" in self.model_fields_set:
            _dict['friendly_name'] = None

        # set to None if links (nullable) is None
        # and model_fields_set contains the field
        if self.links is None and "links" in self.model_fields_set:
            _dict['links'] = None

        # set to None if max_reserved_workers (nullable) is None
        # and model_fields_set contains the field
        if self.max_reserved_workers is None and "max_reserved_workers" in self.model_fields_set:
            _dict['max_reserved_workers'] = None

        # set to None if reservation_activity_name (nullable) is None
        # and model_fields_set contains the field
        if self.reservation_activity_name is None and "reservation_activity_name" in self.model_fields_set:
            _dict['reservation_activity_name'] = None

        # set to None if reservation_activity_sid (nullable) is None
        # and model_fields_set contains the field
        if self.reservation_activity_sid is None and "reservation_activity_sid" in self.model_fields_set:
            _dict['reservation_activity_sid'] = None

        # set to None if sid (nullable) is None
        # and model_fields_set contains the field
        if self.sid is None and "sid" in self.model_fields_set:
            _dict['sid'] = None

        # set to None if target_workers (nullable) is None
        # and model_fields_set contains the field
        if self.target_workers is None and "target_workers" in self.model_fields_set:
            _dict['target_workers'] = None

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
        """Create an instance of TaskrouterV1WorkspaceTaskQueue from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "account_sid": obj.get("account_sid"),
            "assignment_activity_name": obj.get("assignment_activity_name"),
            "assignment_activity_sid": obj.get("assignment_activity_sid"),
            "date_created": obj.get("date_created"),
            "date_updated": obj.get("date_updated"),
            "friendly_name": obj.get("friendly_name"),
            "links": obj.get("links"),
            "max_reserved_workers": obj.get("max_reserved_workers"),
            "reservation_activity_name": obj.get("reservation_activity_name"),
            "reservation_activity_sid": obj.get("reservation_activity_sid"),
            "sid": obj.get("sid"),
            "target_workers": obj.get("target_workers"),
            "task_order": obj.get("task_order"),
            "url": obj.get("url"),
            "workspace_sid": obj.get("workspace_sid")
        })
        return _obj


