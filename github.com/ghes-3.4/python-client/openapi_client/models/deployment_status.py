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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from openapi_client.models.nullable_integration import NullableIntegration
from openapi_client.models.nullable_simple_user import NullableSimpleUser
from typing import Optional, Set
from typing_extensions import Self

class DeploymentStatus(BaseModel):
    """
    The status of a deployment.
    """ # noqa: E501
    created_at: datetime
    creator: Optional[NullableSimpleUser]
    deployment_url: StrictStr
    description: Annotated[str, Field(strict=True, max_length=140)] = Field(description="A short description of the status.")
    environment: Optional[StrictStr] = Field(default='', description="The environment of the deployment that the status is for.")
    environment_url: Optional[StrictStr] = Field(default='', description="The URL for accessing your environment.")
    id: StrictInt
    log_url: Optional[StrictStr] = Field(default='', description="The URL to associate with this status.")
    node_id: StrictStr
    performed_via_github_app: Optional[NullableIntegration] = None
    repository_url: StrictStr
    state: StrictStr = Field(description="The state of the status.")
    target_url: StrictStr = Field(description="Deprecated: the URL to associate with this status.")
    updated_at: datetime
    url: StrictStr
    __properties: ClassVar[List[str]] = ["created_at", "creator", "deployment_url", "description", "environment", "environment_url", "id", "log_url", "node_id", "performed_via_github_app", "repository_url", "state", "target_url", "updated_at", "url"]

    @field_validator('state')
    def state_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['error', 'failure', 'inactive', 'pending', 'success', 'queued', 'in_progress']):
            raise ValueError("must be one of enum values ('error', 'failure', 'inactive', 'pending', 'success', 'queued', 'in_progress')")
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
        """Create an instance of DeploymentStatus from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of creator
        if self.creator:
            _dict['creator'] = self.creator.to_dict()
        # override the default output from pydantic by calling `to_dict()` of performed_via_github_app
        if self.performed_via_github_app:
            _dict['performed_via_github_app'] = self.performed_via_github_app.to_dict()
        # set to None if creator (nullable) is None
        # and model_fields_set contains the field
        if self.creator is None and "creator" in self.model_fields_set:
            _dict['creator'] = None

        # set to None if performed_via_github_app (nullable) is None
        # and model_fields_set contains the field
        if self.performed_via_github_app is None and "performed_via_github_app" in self.model_fields_set:
            _dict['performed_via_github_app'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DeploymentStatus from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "created_at": obj.get("created_at"),
            "creator": NullableSimpleUser.from_dict(obj["creator"]) if obj.get("creator") is not None else None,
            "deployment_url": obj.get("deployment_url"),
            "description": obj.get("description") if obj.get("description") is not None else '',
            "environment": obj.get("environment") if obj.get("environment") is not None else '',
            "environment_url": obj.get("environment_url") if obj.get("environment_url") is not None else '',
            "id": obj.get("id"),
            "log_url": obj.get("log_url") if obj.get("log_url") is not None else '',
            "node_id": obj.get("node_id"),
            "performed_via_github_app": NullableIntegration.from_dict(obj["performed_via_github_app"]) if obj.get("performed_via_github_app") is not None else None,
            "repository_url": obj.get("repository_url"),
            "state": obj.get("state"),
            "target_url": obj.get("target_url") if obj.get("target_url") is not None else '',
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url")
        })
        return _obj


