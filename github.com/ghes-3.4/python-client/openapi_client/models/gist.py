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
from pydantic import BaseModel, ConfigDict, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.base_gist_files_value import BaseGistFilesValue
from openapi_client.models.nullable_simple_user import NullableSimpleUser
from typing import Optional, Set
from typing_extensions import Self

class Gist(BaseModel):
    """
    Gist
    """ # noqa: E501
    comments: StrictInt
    comments_url: StrictStr
    commits_url: StrictStr
    created_at: datetime
    description: Optional[StrictStr]
    files: Dict[str, BaseGistFilesValue]
    forks: Optional[List[Any]] = None
    forks_url: StrictStr
    git_pull_url: StrictStr
    git_push_url: StrictStr
    history: Optional[List[Any]] = None
    html_url: StrictStr
    id: StrictStr
    node_id: StrictStr
    owner: Optional[NullableSimpleUser] = None
    public: StrictBool
    truncated: Optional[StrictBool] = None
    updated_at: datetime
    url: StrictStr
    user: Optional[NullableSimpleUser]
    __properties: ClassVar[List[str]] = ["comments", "comments_url", "commits_url", "created_at", "description", "files", "forks", "forks_url", "git_pull_url", "git_push_url", "history", "html_url", "id", "node_id", "owner", "public", "truncated", "updated_at", "url", "user"]

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
        """Create an instance of Gist from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each value in files (dict)
        _field_dict = {}
        if self.files:
            for _key_files in self.files:
                if self.files[_key_files]:
                    _field_dict[_key_files] = self.files[_key_files].to_dict()
            _dict['files'] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of owner
        if self.owner:
            _dict['owner'] = self.owner.to_dict()
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        # set to None if owner (nullable) is None
        # and model_fields_set contains the field
        if self.owner is None and "owner" in self.model_fields_set:
            _dict['owner'] = None

        # set to None if user (nullable) is None
        # and model_fields_set contains the field
        if self.user is None and "user" in self.model_fields_set:
            _dict['user'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Gist from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "comments": obj.get("comments"),
            "comments_url": obj.get("comments_url"),
            "commits_url": obj.get("commits_url"),
            "created_at": obj.get("created_at"),
            "description": obj.get("description"),
            "files": dict(
                (_k, BaseGistFilesValue.from_dict(_v))
                for _k, _v in obj["files"].items()
            )
            if obj.get("files") is not None
            else None,
            "forks": obj.get("forks"),
            "forks_url": obj.get("forks_url"),
            "git_pull_url": obj.get("git_pull_url"),
            "git_push_url": obj.get("git_push_url"),
            "history": obj.get("history"),
            "html_url": obj.get("html_url"),
            "id": obj.get("id"),
            "node_id": obj.get("node_id"),
            "owner": NullableSimpleUser.from_dict(obj["owner"]) if obj.get("owner") is not None else None,
            "public": obj.get("public"),
            "truncated": obj.get("truncated"),
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url"),
            "user": NullableSimpleUser.from_dict(obj["user"]) if obj.get("user") is not None else None
        })
        return _obj


