import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listVerified(query) {
  return request({
    url: '/system/verified/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getVerified(verifiedId) {
  return request({
    url: '/system/verified/' + verifiedId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addVerified(data) {
  return request({
    url: '/system/verified',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateVerified(data) {
  return request({
    url: '/system/verified',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delVerified(verifiedId) {
  return request({
    url: '/system/verified/' + verifiedId,
    method: 'delete'
  })
}

//条件查询
export function selectVerifiedList(query) {
  return request({
    url: '/system/verified/selectlist',
    method: 'get',
    params: query
  })
}

//列表排序
export function sortListVerified(query) {
  return request({
    url: '/system/verified/sortlist',
    method: 'get',
    params: query
  })
}


export function mhSelectListVerified(condition) {
  return request({
    url: '/system/verified/mhselect/' + condition ,
    method: 'get',
  })
}
