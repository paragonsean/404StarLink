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
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.author_association import AuthorAssociation
from openapi_client.models.auto_merge import AutoMerge
from openapi_client.models.nullable_milestone import NullableMilestone
from openapi_client.models.nullable_simple_user import NullableSimpleUser
from openapi_client.models.pull_request_base import PullRequestBase
from openapi_client.models.pull_request_head import PullRequestHead
from openapi_client.models.pull_request_labels_inner import PullRequestLabelsInner
from openapi_client.models.pull_request_links import PullRequestLinks
from openapi_client.models.simple_user import SimpleUser
from openapi_client.models.team_simple import TeamSimple
from typing import Optional, Set
from typing_extensions import Self

class PullRequest(BaseModel):
    """
    Pull requests let you tell others about changes you've pushed to a repository on GitHub. Once a pull request is sent, interested parties can review the set of changes, discuss potential modifications, and even push follow-up commits if necessary.
    """ # noqa: E501
    links: PullRequestLinks = Field(alias="_links")
    active_lock_reason: Optional[StrictStr] = None
    additions: StrictInt
    assignee: Optional[NullableSimpleUser]
    assignees: Optional[List[SimpleUser]] = None
    author_association: AuthorAssociation
    auto_merge: Optional[AutoMerge]
    base: PullRequestBase
    body: Optional[StrictStr]
    changed_files: StrictInt
    closed_at: Optional[datetime]
    comments: StrictInt
    comments_url: StrictStr
    commits: StrictInt
    commits_url: StrictStr
    created_at: datetime
    deletions: StrictInt
    diff_url: StrictStr
    draft: Optional[StrictBool] = Field(default=None, description="Indicates whether or not the pull request is a draft.")
    head: PullRequestHead
    html_url: StrictStr
    id: StrictInt
    issue_url: StrictStr
    labels: List[PullRequestLabelsInner]
    locked: StrictBool
    maintainer_can_modify: StrictBool = Field(description="Indicates whether maintainers can modify the pull request.")
    merge_commit_sha: Optional[StrictStr]
    mergeable: Optional[StrictBool]
    mergeable_state: StrictStr
    merged: StrictBool
    merged_at: Optional[datetime]
    merged_by: Optional[NullableSimpleUser]
    milestone: Optional[NullableMilestone]
    node_id: StrictStr
    number: StrictInt = Field(description="Number uniquely identifying the pull request within its repository.")
    patch_url: StrictStr
    rebaseable: Optional[StrictBool] = None
    requested_reviewers: Optional[List[SimpleUser]] = None
    requested_teams: Optional[List[TeamSimple]] = None
    review_comment_url: StrictStr
    review_comments: StrictInt
    review_comments_url: StrictStr
    state: StrictStr = Field(description="State of this Pull Request. Either `open` or `closed`.")
    statuses_url: StrictStr
    title: StrictStr = Field(description="The title of the pull request.")
    updated_at: datetime
    url: StrictStr
    user: Optional[NullableSimpleUser]
    __properties: ClassVar[List[str]] = ["_links", "active_lock_reason", "additions", "assignee", "assignees", "author_association", "auto_merge", "base", "body", "changed_files", "closed_at", "comments", "comments_url", "commits", "commits_url", "created_at", "deletions", "diff_url", "draft", "head", "html_url", "id", "issue_url", "labels", "locked", "maintainer_can_modify", "merge_commit_sha", "mergeable", "mergeable_state", "merged", "merged_at", "merged_by", "milestone", "node_id", "number", "patch_url", "rebaseable", "requested_reviewers", "requested_teams", "review_comment_url", "review_comments", "review_comments_url", "state", "statuses_url", "title", "updated_at", "url", "user"]

    @field_validator('state')
    def state_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['open', 'closed']):
            raise ValueError("must be one of enum values ('open', 'closed')")
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
        """Create an instance of PullRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['_links'] = self.links.to_dict()
        # override the default output from pydantic by calling `to_dict()` of assignee
        if self.assignee:
            _dict['assignee'] = self.assignee.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in assignees (list)
        _items = []
        if self.assignees:
            for _item_assignees in self.assignees:
                if _item_assignees:
                    _items.append(_item_assignees.to_dict())
            _dict['assignees'] = _items
        # override the default output from pydantic by calling `to_dict()` of auto_merge
        if self.auto_merge:
            _dict['auto_merge'] = self.auto_merge.to_dict()
        # override the default output from pydantic by calling `to_dict()` of base
        if self.base:
            _dict['base'] = self.base.to_dict()
        # override the default output from pydantic by calling `to_dict()` of head
        if self.head:
            _dict['head'] = self.head.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in labels (list)
        _items = []
        if self.labels:
            for _item_labels in self.labels:
                if _item_labels:
                    _items.append(_item_labels.to_dict())
            _dict['labels'] = _items
        # override the default output from pydantic by calling `to_dict()` of merged_by
        if self.merged_by:
            _dict['merged_by'] = self.merged_by.to_dict()
        # override the default output from pydantic by calling `to_dict()` of milestone
        if self.milestone:
            _dict['milestone'] = self.milestone.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in requested_reviewers (list)
        _items = []
        if self.requested_reviewers:
            for _item_requested_reviewers in self.requested_reviewers:
                if _item_requested_reviewers:
                    _items.append(_item_requested_reviewers.to_dict())
            _dict['requested_reviewers'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in requested_teams (list)
        _items = []
        if self.requested_teams:
            for _item_requested_teams in self.requested_teams:
                if _item_requested_teams:
                    _items.append(_item_requested_teams.to_dict())
            _dict['requested_teams'] = _items
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        # set to None if active_lock_reason (nullable) is None
        # and model_fields_set contains the field
        if self.active_lock_reason is None and "active_lock_reason" in self.model_fields_set:
            _dict['active_lock_reason'] = None

        # set to None if assignee (nullable) is None
        # and model_fields_set contains the field
        if self.assignee is None and "assignee" in self.model_fields_set:
            _dict['assignee'] = None

        # set to None if assignees (nullable) is None
        # and model_fields_set contains the field
        if self.assignees is None and "assignees" in self.model_fields_set:
            _dict['assignees'] = None

        # set to None if auto_merge (nullable) is None
        # and model_fields_set contains the field
        if self.auto_merge is None and "auto_merge" in self.model_fields_set:
            _dict['auto_merge'] = None

        # set to None if body (nullable) is None
        # and model_fields_set contains the field
        if self.body is None and "body" in self.model_fields_set:
            _dict['body'] = None

        # set to None if closed_at (nullable) is None
        # and model_fields_set contains the field
        if self.closed_at is None and "closed_at" in self.model_fields_set:
            _dict['closed_at'] = None

        # set to None if merge_commit_sha (nullable) is None
        # and model_fields_set contains the field
        if self.merge_commit_sha is None and "merge_commit_sha" in self.model_fields_set:
            _dict['merge_commit_sha'] = None

        # set to None if mergeable (nullable) is None
        # and model_fields_set contains the field
        if self.mergeable is None and "mergeable" in self.model_fields_set:
            _dict['mergeable'] = None

        # set to None if merged_at (nullable) is None
        # and model_fields_set contains the field
        if self.merged_at is None and "merged_at" in self.model_fields_set:
            _dict['merged_at'] = None

        # set to None if merged_by (nullable) is None
        # and model_fields_set contains the field
        if self.merged_by is None and "merged_by" in self.model_fields_set:
            _dict['merged_by'] = None

        # set to None if milestone (nullable) is None
        # and model_fields_set contains the field
        if self.milestone is None and "milestone" in self.model_fields_set:
            _dict['milestone'] = None

        # set to None if rebaseable (nullable) is None
        # and model_fields_set contains the field
        if self.rebaseable is None and "rebaseable" in self.model_fields_set:
            _dict['rebaseable'] = None

        # set to None if requested_reviewers (nullable) is None
        # and model_fields_set contains the field
        if self.requested_reviewers is None and "requested_reviewers" in self.model_fields_set:
            _dict['requested_reviewers'] = None

        # set to None if requested_teams (nullable) is None
        # and model_fields_set contains the field
        if self.requested_teams is None and "requested_teams" in self.model_fields_set:
            _dict['requested_teams'] = None

        # set to None if user (nullable) is None
        # and model_fields_set contains the field
        if self.user is None and "user" in self.model_fields_set:
            _dict['user'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PullRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "_links": PullRequestLinks.from_dict(obj["_links"]) if obj.get("_links") is not None else None,
            "active_lock_reason": obj.get("active_lock_reason"),
            "additions": obj.get("additions"),
            "assignee": NullableSimpleUser.from_dict(obj["assignee"]) if obj.get("assignee") is not None else None,
            "assignees": [SimpleUser.from_dict(_item) for _item in obj["assignees"]] if obj.get("assignees") is not None else None,
            "author_association": obj.get("author_association"),
            "auto_merge": AutoMerge.from_dict(obj["auto_merge"]) if obj.get("auto_merge") is not None else None,
            "base": PullRequestBase.from_dict(obj["base"]) if obj.get("base") is not None else None,
            "body": obj.get("body"),
            "changed_files": obj.get("changed_files"),
            "closed_at": obj.get("closed_at"),
            "comments": obj.get("comments"),
            "comments_url": obj.get("comments_url"),
            "commits": obj.get("commits"),
            "commits_url": obj.get("commits_url"),
            "created_at": obj.get("created_at"),
            "deletions": obj.get("deletions"),
            "diff_url": obj.get("diff_url"),
            "draft": obj.get("draft"),
            "head": PullRequestHead.from_dict(obj["head"]) if obj.get("head") is not None else None,
            "html_url": obj.get("html_url"),
            "id": obj.get("id"),
            "issue_url": obj.get("issue_url"),
            "labels": [PullRequestLabelsInner.from_dict(_item) for _item in obj["labels"]] if obj.get("labels") is not None else None,
            "locked": obj.get("locked"),
            "maintainer_can_modify": obj.get("maintainer_can_modify"),
            "merge_commit_sha": obj.get("merge_commit_sha"),
            "mergeable": obj.get("mergeable"),
            "mergeable_state": obj.get("mergeable_state"),
            "merged": obj.get("merged"),
            "merged_at": obj.get("merged_at"),
            "merged_by": NullableSimpleUser.from_dict(obj["merged_by"]) if obj.get("merged_by") is not None else None,
            "milestone": NullableMilestone.from_dict(obj["milestone"]) if obj.get("milestone") is not None else None,
            "node_id": obj.get("node_id"),
            "number": obj.get("number"),
            "patch_url": obj.get("patch_url"),
            "rebaseable": obj.get("rebaseable"),
            "requested_reviewers": [SimpleUser.from_dict(_item) for _item in obj["requested_reviewers"]] if obj.get("requested_reviewers") is not None else None,
            "requested_teams": [TeamSimple.from_dict(_item) for _item in obj["requested_teams"]] if obj.get("requested_teams") is not None else None,
            "review_comment_url": obj.get("review_comment_url"),
            "review_comments": obj.get("review_comments"),
            "review_comments_url": obj.get("review_comments_url"),
            "state": obj.get("state"),
            "statuses_url": obj.get("statuses_url"),
            "title": obj.get("title"),
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url"),
            "user": NullableSimpleUser.from_dict(obj["user"]) if obj.get("user") is not None else None
        })
        return _obj


