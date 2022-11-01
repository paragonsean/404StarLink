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
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.nullable_simple_user import NullableSimpleUser
from openapi_client.models.repository import Repository
from typing import Optional, Set
from typing_extensions import Self

class Migration(BaseModel):
    """
    A migration.
    """ # noqa: E501
    archive_url: Optional[StrictStr] = None
    created_at: datetime
    exclude: Optional[List[Any]] = None
    exclude_attachments: StrictBool
    exclude_git_data: StrictBool
    exclude_metadata: StrictBool
    exclude_owner_projects: StrictBool
    exclude_releases: StrictBool
    guid: StrictStr
    id: StrictInt
    lock_repositories: StrictBool
    node_id: StrictStr
    org_metadata_only: StrictBool
    owner: Optional[NullableSimpleUser]
    repositories: List[Repository] = Field(description="The repositories included in the migration. Only returned for export migrations.")
    state: StrictStr
    updated_at: datetime
    url: StrictStr
    __properties: ClassVar[List[str]] = ["archive_url", "created_at", "exclude", "exclude_attachments", "exclude_git_data", "exclude_metadata", "exclude_owner_projects", "exclude_releases", "guid", "id", "lock_repositories", "node_id", "org_metadata_only", "owner", "repositories", "state", "updated_at", "url"]

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
        """Create an instance of Migration from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of owner
        if self.owner:
            _dict['owner'] = self.owner.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in repositories (list)
        _items = []
        if self.repositories:
            for _item_repositories in self.repositories:
                if _item_repositories:
                    _items.append(_item_repositories.to_dict())
            _dict['repositories'] = _items
        # set to None if owner (nullable) is None
        # and model_fields_set contains the field
        if self.owner is None and "owner" in self.model_fields_set:
            _dict['owner'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Migration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "archive_url": obj.get("archive_url"),
            "created_at": obj.get("created_at"),
            "exclude": obj.get("exclude"),
            "exclude_attachments": obj.get("exclude_attachments"),
            "exclude_git_data": obj.get("exclude_git_data"),
            "exclude_metadata": obj.get("exclude_metadata"),
            "exclude_owner_projects": obj.get("exclude_owner_projects"),
            "exclude_releases": obj.get("exclude_releases"),
            "guid": obj.get("guid"),
            "id": obj.get("id"),
            "lock_repositories": obj.get("lock_repositories"),
            "node_id": obj.get("node_id"),
            "org_metadata_only": obj.get("org_metadata_only"),
            "owner": NullableSimpleUser.from_dict(obj["owner"]) if obj.get("owner") is not None else None,
            "repositories": [Repository.from_dict(_item) for _item in obj["repositories"]] if obj.get("repositories") is not None else None,
            "state": obj.get("state"),
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url")
        })
        return _obj


