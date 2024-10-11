# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ReposCreateCommitStatusRequest(BaseModel):
    """
    ReposCreateCommitStatusRequest
    """ # noqa: E501
    context: Optional[StrictStr] = Field(default='default', description="A string label to differentiate this status from the status of other systems. This field is case-insensitive.")
    description: Optional[StrictStr] = Field(default=None, description="A short description of the status.")
    state: StrictStr = Field(description="The state of the status.")
    target_url: Optional[StrictStr] = Field(default=None, description="The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.   For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:   `http://ci.example.com/user/repo/build/sha`")
    __properties: ClassVar[List[str]] = ["context", "description", "state", "target_url"]

    @field_validator('state')
    def state_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['error', 'failure', 'pending', 'success']):
            raise ValueError("must be one of enum values ('error', 'failure', 'pending', 'success')")
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
        """Create an instance of ReposCreateCommitStatusRequest from a JSON string"""
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
        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        # set to None if target_url (nullable) is None
        # and model_fields_set contains the field
        if self.target_url is None and "target_url" in self.model_fields_set:
            _dict['target_url'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReposCreateCommitStatusRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "context": obj.get("context") if obj.get("context") is not None else 'default',
            "description": obj.get("description"),
            "state": obj.get("state"),
            "target_url": obj.get("target_url")
        })
        return _obj


